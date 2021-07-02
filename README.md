# Enigma-Machine-Java
Enigma Machine simulation, which was built with Java and Android Studio under the IB Computer Science Term Grade Assessment. The logic itself is simplified, because of the nature of the task.

Design Specification and Success Criteria (Pre-Development)
Before making the initial design for the Enigma Machine app, we should write down the design specification and success criteria for it.

In order the app to work, it should do and have few simple features:
•	It should have let the user configure the machine (rotors and the plugboard) from the application itself
•	let the user encrypt messages (just English letters a-z) after configuring the machine
•	let the user decrypt messages (just English letters a-z) after configuring the machine
•	Naming of the ids should follow one guideline, for it to be easily identified and accessed 
•	Activities (pages) should be easily distinguishable from each other by either color, title, features
For these features to work correctly and successfully, we should be able to achieve these main things: 
•	Design instructions should be followed accordingly
•	Design of the app should be relatively nice to enhance user experience
•	The functions should be clear, well presented with additional info’s
•	Lastly and most importantly, all the features and the main components should work well with each other and the code must be organized and easy to read

Record of Tasks (Pre-Development)
Planned Action	Planned Outcome	Estimated Time
Getting to know the machine	Knowledge of how the machine/components is built and working	3-6 days
Combined for two students
Design and overview 	Visualized version of the app and its UI	1-2 days
Combined for two students
Design of the App Architecture	List of programming tools and how would they work with each other	1-2 days
Combined for two students
Developing of the app	Working prototype of the app	1-2 weeks
Combined for two students
Testing of the app	Finding bugs and resolving them	1-3 days
Combined for two students
Making final changes	Final Version of the app	1-2 days
Combined for two students
    
Developing the product
The development of the product as expected was full of challenges and errors. We would occasionally talk with the teacher to give his view on the design and the problems that we faced. The initial design was more or less good and easy to follow and again, as expected we made some changes to the design:
•	First one is that in the initial design we didn’t have info’s on the pages. We added them because for the people who are unaware of the machine and want to use them and give them basic and simple information about the machine and how it works.
•	The first problem that we faced was the keyboard and the input of the character. We had several options for example, edit text to replace the keyboard but it was uncomfortable to use because every time we input the text it should have been updated with the button or something like that so we went with on-screen keyboard which is made out of buttons.
•	The second problem faced was the buttons of the keyboard. Because of the size of qwerty and the configuration of it, it wouldn’t sit nicely on the screen and mostly we wouldn’t see the buttons and its inner text so we had to find the sweet spot for its size, which took a lot of time.
•	We also added several outputs which were the indications of what path the input takes. For example, we are showing the output after plugboard, rotors and then the final one.
•	During the development of the rotors, we didn’t add the function of it turning after the input. Because of the fact that this is only the simplified version we sticked to the design that we have right now and the reason being that we tried to implement it, but for some reason android studio would crush for no reason, so we ditched that.
•	During the development of the decrypt, we just basically copied the encrypt activities code and changed the path of the input, so it would go from rotor 3 to 2 to 1 and then the plugboard but it wouldn’t work and after hours of investigating we saw that we didn’t reverse the way of the path that input takes in the rotors itself. 
•	We removed the reflector from the final app, because it just adds the not needed complexity and it wouldn’t really change the way that machine works, because reflector is pre-configured plugboard and we already have that. 
•	We also tried turning our app into landscape mode and we failed miserably so we also gave up on that.
Apart from these problems the development went smoothly, and the reason. We think that the reason for that is the good pre-design of the app that we did and came up with.
Evaluating the product
In the end we think that we managed to follow our success criteria and check all the possible lists of it as much as possible. We know that the development is much more different than the design and during development we have to make some kinds of design sacrifices for the app to work. 
The app’s user interface is nice and it’s easy to navigate and use. There is some additional information for the user to guide them through the app. The code is organized and easy to read, ids are named by one guideline and aren’t messy. And the most importantly the app works and the components are successfully connected with each other. 
Recommendations for improving the product
There are some features to improve or add from our side: 
•	Adding the reflector
•	Making the rotor movement more realistic
•	Changing the visual design of the app to fit the image of enigma 
•	Convert the app to fit the landscape mode
•	Furthermore, organize the code
