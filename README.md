# ISU
ArrayList bank(A/B) - Question bank
ArrayList ans(A/B) - Answer bank

boolean: repeat - allows for repeat tests, admin retry log ins, and admin returning to main menu.

ArrayList temp_bank(A/B) - Used to avoid repeat questions while allowing repeat tests.
ArrayList temp_ans(A/B) - Used to avoid repeat questions while allowing repeat tests.

int: option = allows user to choose admin or G1 test
boolean: menu = repeats until user chooses admin or G1 test

boolean: fail = if user cannot pass test, automatically ends test.

int: questions_asked(A/B) - # of questions asked
int: score(A/B) - # of questions answered correctly

int: askd_question - question asked, taken from question bank, along with being able to track index of ans and bank array lists.

char: answer - answer (a/b/c/d) given by user. Used to check compared to specific index of ans.

float: finalScore - final score, questions answered correctly by user. Used to show final percentage score.

String: adminPassword - for admin section later. password.
String: password_attempt - .equals() to adminPassword to see if user given password is the password.

char: answer - admin options, to add, remove and return to main menu.
char: bank_option - admin option to choose bank affected by add or remove.
String: new_question - admin can add entire question with multiple choices.
char: new_answer - answer to the question asked with multiple choice.
int: remove - index of array list of which is removed.

===== WORK LOG =====
January 17th, Sat 2025
- Started ISU, made main menu
- Added question bank and answer bank
January 18th, Sun 2025
- Created and polished G1 test
- Created and polished Admin options
