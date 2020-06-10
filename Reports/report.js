$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Feature.feature");
formatter.feature({
  "name": "verifying the BeautyBay website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "verifying the BeautyBay website by purchasing a product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user clicks on the Signin image and navigates to the loginURL Page",
  "keyword": "When "
});
formatter.step({
  "name": "user enters the \"\u003cEmail\u003e\" and \"\u003cpassword\u003e\" and clicks on the sigin button and navigates to account page",
  "keyword": "And "
});
formatter.step({
  "name": "user checks on the brokenlinks and broken image",
  "keyword": "And "
});
formatter.step({
  "name": "user moves to the Explore link and click on NudePalettes link",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on the Sort button and click on the Customer Rating",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on the Filter button and  click on Brand button and select on Wet and Wild checkbox and click on the close button",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on Done button",
  "keyword": "And "
});
formatter.step({
  "name": "user Selects a product  and click on that particular product",
  "keyword": "And "
});
formatter.step({
  "name": "user Selects the colour for the product in the dropdown box",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on Add to bag button and click on the view bag button on the popup message",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on the  + icon in the box to add up the qnty of the items",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on Checkout securely button  and click on Next button",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on the Next button and again clicks on the nect button",
  "keyword": "And "
});
formatter.step({
  "name": "user see the outcome",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Email",
        "password"
      ]
    },
    {
      "cells": [
        "lakshmichokalingam13@gmail.com",
        "Vimala@13"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on Beauty Bay site",
  "keyword": "Given "
});
formatter.match({
  "location": "BeautyBayStep.user_is_on_Beauty_Bay_site()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verifying the BeautyBay website by purchasing a product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user clicks on the Signin image and navigates to the loginURL Page",
  "keyword": "When "
});
formatter.match({
  "location": "BeautyBayStep.user_clicks_on_the_Signin_image_and_navigates_to_the_loginURL_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the \"lakshmichokalingam13@gmail.com\" and \"Vimala@13\" and clicks on the sigin button and navigates to account page",
  "keyword": "And "
});
formatter.match({
  "location": "BeautyBayStep.user_enters_the_and_and_clicks_on_the_sigin_button_and_navigates_to_account_page(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user checks on the brokenlinks and broken image",
  "keyword": "And "
});
formatter.match({
  "location": "BeautyBayStep.user_checks_on_the_brokenlinks_and_broken_image()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user moves to the Explore link and click on NudePalettes link",
  "keyword": "And "
});
formatter.match({
  "location": "BeautyBayStep.user_moves_to_the_Explore_link_and_click_on_NudePalettes_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Sort button and click on the Customer Rating",
  "keyword": "And "
});
formatter.match({
  "location": "BeautyBayStep.user_clicks_on_the_Sort_button_and_click_on_the_Customer_Rating()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Filter button and  click on Brand button and select on Wet and Wild checkbox and click on the close button",
  "keyword": "And "
});
formatter.match({
  "location": "BeautyBayStep.user_clicks_on_the_Filter_button_and_click_on_Brand_button_and_select_on_Wet_and_Wild_checkbox_and_click_on_the_close_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Done button",
  "keyword": "And "
});
formatter.match({
  "location": "BeautyBayStep.user_clicks_on_Done_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Selects a product  and click on that particular product",
  "keyword": "And "
});
formatter.match({
  "location": "BeautyBayStep.user_Selects_a_product_and_click_on_that_particular_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Selects the colour for the product in the dropdown box",
  "keyword": "And "
});
formatter.match({
  "location": "BeautyBayStep.user_Selects_the_colour_for_the_product_in_the_dropdown_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Add to bag button and click on the view bag button on the popup message",
  "keyword": "And "
});
formatter.match({
  "location": "BeautyBayStep.user_clicks_on_Add_to_bag_button_and_click_on_the_view_bag_button_on_the_popup_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the  + icon in the box to add up the qnty of the items",
  "keyword": "And "
});
formatter.match({
  "location": "BeautyBayStep.user_clicks_on_the_icon_in_the_box_to_add_up_the_qnty_of_the_items()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Checkout securely button  and click on Next button",
  "keyword": "And "
});
formatter.match({
  "location": "BeautyBayStep.user_clicks_on_Checkout_securely_button_and_click_on_Next_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Next button and again clicks on the nect button",
  "keyword": "And "
});
formatter.match({
  "location": "BeautyBayStep.user_clicks_on_the_Next_button_and_again_clicks_on_the_nect_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d83.0.4103.97)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-9IVFA709\u0027, ip: \u0027192.168.43.184\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.97, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\Vimal\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:58802}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 25ebfe7d36dbc44ec23a34024c5b4267\n*** Element info: {Using\u003dxpath, value\u003d(//input[@type\u003d\u0027submit\u0027])[3]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\r\n\tat org.baseclass.BaseClass.btnClk(BaseClass.java:90)\r\n\tat org.stepdefinition.BeautyBayStep.user_clicks_on_the_Next_button_and_again_clicks_on_the_nect_button(BeautyBayStep.java:162)\r\n\tat ✽.user clicks on the Next button and again clicks on the nect button(src/test/resources/Feature/Feature.feature:19)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user see the outcome",
  "keyword": "Then "
});
formatter.match({
  "location": "BeautyBayStep.user_see_the_outcome()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});