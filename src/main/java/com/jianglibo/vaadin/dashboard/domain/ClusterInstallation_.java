package com.jianglibo.vaadin.dashboard.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-08-10T08:41:34.659+0800")
@StaticMetamodel(ClusterInstallation.class)
public class ClusterInstallation_ extends BaseEntity_ {
	public static volatile SingularAttribute<ClusterInstallation, String> name;
	public static volatile SingularAttribute<ClusterInstallation, String> appname;
	public static volatile SetAttribute<ClusterInstallation, BoxAndRole> boxes;
}