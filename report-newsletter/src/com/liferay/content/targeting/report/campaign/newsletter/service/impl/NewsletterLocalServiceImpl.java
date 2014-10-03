/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.content.targeting.report.campaign.newsletter.service.impl;

import com.liferay.content.targeting.report.campaign.newsletter.model.Newsletter;
import com.liferay.content.targeting.report.campaign.newsletter.service.base.NewsletterLocalServiceBaseImpl;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import org.omg.CORBA.SystemException;

import java.util.Date;

/**
 * The implementation of the newsletter local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.content.targeting.report.campaign.newsletter.service.NewsletterLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.content.targeting.report.campaign.newsletter.service.base.NewsletterLocalServiceBaseImpl
 * @see com.liferay.content.targeting.report.campaign.newsletter.service.NewsletterLocalServiceUtil
 */
public class NewsletterLocalServiceImpl extends NewsletterLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.liferay.content.targeting.report.campaign.newsletter.service.NewsletterLocalServiceUtil} to access the newsletter local service.
	 */

	@Override
	public Newsletter addNewsletter(
			long campaignId, String alias, String elementId, String eventType, int count)
		throws PortalException, SystemException {

		Newsletter newsletter = newsletterPersistence.fetchByC_A_E_E(
			campaignId, alias, elementId, eventType);

		if (newsletter == null) {
			long newsletterId = CounterLocalServiceUtil.increment();

			newsletter = newsletterPersistence.create(newsletterId);

			newsletter.setCampaignId(campaignId);
			newsletter.setAlias(alias);
			newsletter.setElementId(elementId);
			newsletter.setEventType(eventType);
		}

		newsletter.setCount(
			newsletter.getCount() + count);
		newsletter.setModifiedDate(new Date());

		newsletterPersistence.update(newsletter);

		return newsletter;
	}
}