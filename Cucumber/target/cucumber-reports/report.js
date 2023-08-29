$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("orangeHrm.feature");
formatter.feature({
  "line": 1,
  "name": "OrangeHrm App Testing",
  "description": "",
  "id": "orangehrm-app-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "orangeHrm",
  "description": "",
  "id": "orangehrm-app-testing;orangehrm",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Get Url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Input UserName From Username Input Feield",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Input Password From Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click The Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click The Pim Menu",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Add Emplayee Details Menu Click",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Input The Value In Firstname",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Input The Middlename in Middlename field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Input The Lastname In Lastname field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Click The Save Button And Navigate To Main Menu",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definiton.get_Url()"
});
formatter.result({
  "duration": 192637900,
  "error_message": "java.lang.NullPointerException\r\n\tat base_class.BassClass.getur(BassClass.java:28)\r\n\tat step_definition.Step_Definiton.get_Url(Step_Definiton.java:24)\r\n\tat ✽.Given Get Url(orangeHrm.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Step_Definiton.input_UserName_From_Username_Input_Feield()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Step_Definiton.input_Password_From_Password_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Step_Definiton.click_The_Login_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Step_Definiton.click_The_Pim_Menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Step_Definiton.add_Emplayee_Details_Menu_Click()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Step_Definiton.input_The_Value_In_Firstname()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Step_Definiton.input_The_Middlename_in_Middlename_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Step_Definiton.input_The_Lastname_In_Lastname_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Step_Definiton.click_The_Save_Button_And_Navigate_To_Main_Menu()"
});
formatter.result({
  "status": "skipped"
});
});