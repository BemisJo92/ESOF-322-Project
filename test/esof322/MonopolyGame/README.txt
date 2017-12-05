MONOPOLY README
Authors: Joel Lechman, John Bemis, Logan Davis, Ian Hecker
****************************************

Our Monopoly program must be run in either Netbeans
or Eclipse, and it would behoove the user to adjust
both windows to a larger size that is comfortable to see.
Some moniters are in a higher resolution than others and 
were having problems viewing the board so we made it
smaller so that the user could adjust to their liking. 

NOTICE: The user input is prompted for in the GUI window,
but it must be inputted in either the Netbeans or Eclipse
command windows. We'd be more than happy to show that this
works if the project does not run as expected.

Everything that we could have tested, we did. There are
a couple of methods and classes that we simply could not test, 
such as the Game.java class. It was not possible to create
an instance of game in the test class, so we resolved not to
include JUnit test classes. This also includes the doAction() 
methods, however we tested both of these vigorously by manual
methods.

For version 2 of the assignment we chose to implement the Chance
and Community Chest tiles along with their complementary cards
and rules such as the "Go-To-Jail" and "Get out of jail free"
cards. We also implemented a second "theme" to our game as
required. When launching the application, the user is prompted
to choose which theme they would like to play. The options 
offered are: 1. The traditional monopoly board. 2. A 
"National Park" themed board and tiles.

What was especially strong about our assignment:
Everything that we possibly could test using Junit tests
was tested. Even simple get methods were tested for accuracy.
Therefore our coverage for everything that we possibly could
create tests for (within our abilities) is 100%. 


One weak part of our assignment is how we handle user input.
Due to our lack of experience with GUI's and interaction
between GUI objects and other classes, we choose to handle
user input in a more unusual way where the user's choices
have to be inputted into the Netbeans or Eclipse windows.
We decided this would be better as we could use our time
to focus on the abstract factory and testing parts of the
assignment which seem to be the main focus of PA4 and are
important topics in the class where GUI's are not. This
later became a problem when it came to testing our classes.
the Junit tests became very difficult/impossible to write
when it came to methods that used user interaction.

If we had more time for this assignment we would for sure 
fix how our program handles user interaction including the
the buttons on our GUI. It would make methods much more
testable and create a better experience for end users.
We would also fix the window sizes and layout of our GUI
to also enhance user experience.


Our GUI class should serve to cleanly separate the 
user interface layer from the application and domain layers.

NOTE: When viewing our class Diagram please zoom in as the file is a .PNG