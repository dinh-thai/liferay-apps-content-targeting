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

package com.liferay.content.targeting.rule.engine.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RuleEngineLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RuleEngineLocalService
 * @generated
 */
public class RuleEngineLocalServiceWrapper implements RuleEngineLocalService,
	ServiceWrapper<RuleEngineLocalService> {
	public RuleEngineLocalServiceWrapper(
		RuleEngineLocalService ruleEngineLocalService) {
		_ruleEngineLocalService = ruleEngineLocalService;
	}

	/**
	* Adds the rule engine to the database. Also notifies the appropriate model listeners.
	*
	* @param ruleEngine the rule engine
	* @return the rule engine that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.content.targeting.rule.engine.model.RuleEngine addRuleEngine(
		com.liferay.content.targeting.rule.engine.model.RuleEngine ruleEngine)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ruleEngineLocalService.addRuleEngine(ruleEngine);
	}

	/**
	* Creates a new rule engine with the primary key. Does not add the rule engine to the database.
	*
	* @param dummyId the primary key for the new rule engine
	* @return the new rule engine
	*/
	@Override
	public com.liferay.content.targeting.rule.engine.model.RuleEngine createRuleEngine(
		long dummyId) {
		return _ruleEngineLocalService.createRuleEngine(dummyId);
	}

	/**
	* Deletes the rule engine with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dummyId the primary key of the rule engine
	* @return the rule engine that was removed
	* @throws PortalException if a rule engine with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.content.targeting.rule.engine.model.RuleEngine deleteRuleEngine(
		long dummyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ruleEngineLocalService.deleteRuleEngine(dummyId);
	}

	/**
	* Deletes the rule engine from the database. Also notifies the appropriate model listeners.
	*
	* @param ruleEngine the rule engine
	* @return the rule engine that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.content.targeting.rule.engine.model.RuleEngine deleteRuleEngine(
		com.liferay.content.targeting.rule.engine.model.RuleEngine ruleEngine)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ruleEngineLocalService.deleteRuleEngine(ruleEngine);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ruleEngineLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ruleEngineLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.content.targeting.rule.engine.model.impl.RuleEngineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _ruleEngineLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.content.targeting.rule.engine.model.impl.RuleEngineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ruleEngineLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ruleEngineLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ruleEngineLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.content.targeting.rule.engine.model.RuleEngine fetchRuleEngine(
		long dummyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ruleEngineLocalService.fetchRuleEngine(dummyId);
	}

	/**
	* Returns the rule engine with the primary key.
	*
	* @param dummyId the primary key of the rule engine
	* @return the rule engine
	* @throws PortalException if a rule engine with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.content.targeting.rule.engine.model.RuleEngine getRuleEngine(
		long dummyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ruleEngineLocalService.getRuleEngine(dummyId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ruleEngineLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the rule engines.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.content.targeting.rule.engine.model.impl.RuleEngineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rule engines
	* @param end the upper bound of the range of rule engines (not inclusive)
	* @return the range of rule engines
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.content.targeting.rule.engine.model.RuleEngine> getRuleEngines(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ruleEngineLocalService.getRuleEngines(start, end);
	}

	/**
	* Returns the number of rule engines.
	*
	* @return the number of rule engines
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getRuleEnginesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ruleEngineLocalService.getRuleEnginesCount();
	}

	/**
	* Updates the rule engine in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ruleEngine the rule engine
	* @return the rule engine that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.content.targeting.rule.engine.model.RuleEngine updateRuleEngine(
		com.liferay.content.targeting.rule.engine.model.RuleEngine ruleEngine)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ruleEngineLocalService.updateRuleEngine(ruleEngine);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _ruleEngineLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_ruleEngineLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _ruleEngineLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public long[] getMatchesUserSegmentIds(
		javax.servlet.http.HttpServletRequest request, long[] groupIds,
		long anonymousUserId) throws java.lang.Exception {
		return _ruleEngineLocalService.getMatchesUserSegmentIds(request,
			groupIds, anonymousUserId);
	}

	@Override
	public long[] getMatchesUserSegmentIds(
		javax.servlet.http.HttpServletRequest request, long groupId,
		long anonymousUserId) throws java.lang.Exception {
		return _ruleEngineLocalService.getMatchesUserSegmentIds(request,
			groupId, anonymousUserId);
	}

	@Override
	public boolean matches(javax.servlet.http.HttpServletRequest request,
		long anonymousUserId,
		com.liferay.content.targeting.model.UserSegment userSegment)
		throws java.lang.Exception {
		return _ruleEngineLocalService.matches(request, anonymousUserId,
			userSegment);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public RuleEngineLocalService getWrappedRuleEngineLocalService() {
		return _ruleEngineLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedRuleEngineLocalService(
		RuleEngineLocalService ruleEngineLocalService) {
		_ruleEngineLocalService = ruleEngineLocalService;
	}

	@Override
	public RuleEngineLocalService getWrappedService() {
		return _ruleEngineLocalService;
	}

	@Override
	public void setWrappedService(RuleEngineLocalService ruleEngineLocalService) {
		_ruleEngineLocalService = ruleEngineLocalService;
	}

	private RuleEngineLocalService _ruleEngineLocalService;
}