# cs3130-A02

# Textbook Marketplace

For this assignment you will create a application to support a textbook marketplace where users of the app can sell or buy textbooks. To keep things less complex the textbook database will only be alive while the app is running (no writing the data to disk or cloud is required).

Your application should contain the following screens:

Marketplace main screen:

* Gives users two options
    - Sell a Book
    - Buy a Book

If the user chooses `Sell a book` they will be brought to a screen wherein they are asked to enter the Book Title, the price and a description. It will have a save button that saves the information (into your book database) and then clears the information. The user could then enter another book to sell or click the android back arrow to go back a screen.

If the user chooses `Buy a Book` they will be brought to the list of books that are available for sale. Beside each book is a `buy` button which upon clicking removes that book from the marketplace and reloads the list of books for sale.

The `database` for your textbook marketplace will be a singleton class. This is a design pattern choice which ensures that only one object of this type exists. Your singleton class will contain a List of books, and each screen in the application will know they are getting the one and only one List of books. We will discuss the singleton pattern in class and a video will be posted describing its uses.

By default your program should always create 3 fake books for sale, each time the program is loaded.

To alleviate the various android studio versions and types. You are given an empty repository for this assignment - into which you will add a new android studio project. How to check out a general repository from git will be discussed in class - or you can experiment with the git command line or github desktop to facilitate this.

Grading:

Gradable | Grade
--- | ---
Code Readability | 2 points
Code Design | 4 points
Functionality | 4 points

Code readability: did you use proper names, did you use strings.xml, indentation, comments, etc

Code Design: 4 points this assignment since you will have to figure out how to handle text books and require a few activities and encorporate a singleton based database

Functionality: does the program behave properly - this includes proper handling of screen rotation and the general program requirements
