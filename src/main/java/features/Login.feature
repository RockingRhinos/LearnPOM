Feature: leaf taps login

Scenario Outline: TC001 test with positive credentials

Given enter username as <userName>
And enter password as <password>
When click login 
Then verify page text

Examples:
|userName|password|
|democsr|crmsfa|
|demosalesmanager|crmsfa|