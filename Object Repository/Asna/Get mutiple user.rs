<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get mutiple user</name>
   <tag></tag>
   <elementGuidId>859cacb7-08dd-4c33-b907-216c727e0734</elementGuidId>
   <selectorMethod>XPATH</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:type</name>
      <type>Main</type>
      <value>OAuth 2.0</value>
      <webElementGuid>8ef2a12d-cacf-4dc6-807c-48fa2ee7dfbc</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer 2/1206784948256851/1206785098413191:13660e93861afeffcb69665d809de721</value>
      <webElementGuid>53e230dc-6b07-43c3-a158-e8dc0bc684f3</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:grant_type</name>
      <type>Main</type>
      <value>Password Credentials</value>
      <webElementGuid>4d40feae-3408-47a1-b35b-a43413f26594</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:access_token_url</name>
      <type>Main</type>
      <value></value>
      <webElementGuid>f7a49e91-81d9-42fb-910e-4d2fb5017fc4</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:state</name>
      <type>Main</type>
      <value></value>
      <webElementGuid>4581a5f8-9ca5-45a3-89c9-b00165c66898</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:authorization_code</name>
      <type>Main</type>
      <value></value>
      <webElementGuid>9d1f479b-3d6c-4bbd-ab82-09ce1faf6d42</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:scope</name>
      <type>Main</type>
      <value></value>
      <webElementGuid>cb5c1d17-4134-4cae-8007-0418df2e880b</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:access</name>
      <type>Main</type>
      <value>2/1206784948256851/1206785098413191:13660e93861afeffcb69665d809de721</value>
      <webElementGuid>b9cc144d-9b5c-4748-8749-ece815b5ca7e</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:refesh_token</name>
      <type>Main</type>
      <value></value>
      <webElementGuid>38b5a70c-54cd-4ca3-98d9-28139f5701cd</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:oauth_consumer_key</name>
      <type>Main</type>
      <value></value>
      <webElementGuid>040270c4-fcbb-4b5e-8858-e957b4f49174</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:oauth_consumer_secret</name>
      <type>Main</type>
      <value></value>
      <webElementGuid>2d21beb7-9516-4c66-b20f-0f6dc0a67142</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:token_type</name>
      <type>Main</type>
      <value></value>
      <webElementGuid>c0ba194c-5cb3-4e7f-8bed-532773b76171</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:user_name</name>
      <type>Main</type>
      <value></value>
      <webElementGuid>427f4545-9dc9-4d44-bbec-83478e33e355</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:password</name>
      <type>Main</type>
      <value></value>
      <webElementGuid>67b6c9e5-21d5-467a-9df9-592430d510be</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.3.2</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://app.asana.com/api/1.0/users</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
