<?xml version="1.0"?>
<recipe>
    <#include "recipe_manifest.xml.ftl" />

<#if generateLayout>
    <#include "recipe_simple.xml.ftl" />
    <open file="${escapeXmlAttribute(resOut)}/layout/${layoutName}.xml" />
</#if>

    <instantiate from="root/src/app_package/SimpleActivity.java.ftl"
                   to="${escapeXmlAttribute(srcOut)}/ui/${activityClass}.java" />

    <open file="${escapeXmlAttribute(srcOut)}/ui/${activityClass}.java" />
	
    <instantiate from="root/src/app_package/SimplePresenter.java.ftl"
                   to="${escapeXmlAttribute(srcOut)}/presenter/${presenterClass}.java" />
				   
    <open file="${escapeXmlAttribute(srcOut)}/presenter/${presenterClass}.java" />
	
    <instantiate from="root/src/app_package/SimpleView.java.ftl"
                   to="${escapeXmlAttribute(srcOut)}/presenter/view/${viewClass}.java" />
				   
    <open file="${escapeXmlAttribute(srcOut)}/presenter/view/${viewClass}.java" />
</recipe>
