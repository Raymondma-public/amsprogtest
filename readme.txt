Due to time limit, I should do much more integration test and system test for PersonServiceBean and PersonController.
I should test all the combinations for the parameters(Name, Age, Gender):
For Name, the following are the possibilities:
	null
	empty String
	with only one words
	with more than 2 words
	first name is "John"
	first name is not "John"
	first name contains "John"
	first name does not contains "ko"
	first name contains "ko" in middle
	first name end with "ko"
	first name is "Ko"
	
For Age, the following are the possibilities:
	<0
	=0
	=50
	=51
	>50

For Gender, the following are the possibilities:
	null
	"MAN"
	"WOMAN"
	other 
	
There can be 11 * 5 * 4 = 660 combinations of test cases from the above possibilities.

Considering the future change of data source. I should add the following methods for the PersonDao:
	public int countMatched(String keyword);
	public int sumAgeMatched(String keyword);
	If data source change to Database in the future. We can simply do the above operations from the database and do simple calculation from the server or software to get the average age.