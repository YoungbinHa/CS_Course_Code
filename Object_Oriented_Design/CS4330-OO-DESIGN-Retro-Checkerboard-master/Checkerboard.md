# CS4330-OO-DESIGN-Retro-Checkerboard
### name: Youngbin Ha
### pawprint: yh9kb
### student#: 14141727


#### 1. Reflect on (think about) the work you did for the challenge. How did you do? What did you get right? What did you get wrong? What did you do differently (and possibly better) than what was posted in the solution? What was hard to do?

-> I got the general idea like how to calculate the height and weight of each checkers (ex. rectangleWidth = width / 

(double)columns); rectangleHeight = height / (double)rows);) and build the rectangles. (ex. Rectangle rect = new 

Rectangle(row*this.rectangleWidth, col*this.rectangleHeight, this.rectangleWidth, this.rectangleHeight);). However, with 

controller I made new checkerboard too complicated comparing the answer. There are readability differences a lot.

For example

---
My code:  

this.checkerBoard= new Checker.CheckerBoard(this.numRows, this.numColumns,this.stage.getScene().getWidth(), this.stage.getScene().getHeight()-this.menuBar.getHeight(), this.lightColor, this.darkColor); vBox.getChildren().add(this.checkerBoard.getBoard());

---
Anwser:

checkerBoard = new CheckerBoard(numRows, numCols, boardWidth, boardHeight, lightColor, darkColor); stackPane.getChildren().add(checkerBoard.build());

---

#### 2. How well did you understand the programming concepts and foundational knowledge needed to complete the challenge?

--> I could understand what is MVC and the concept of it. I actually practice how to seperate Model, View and Control; also

what is expected each areas like model contains simple data; view shows UI for users; control literally controls the functions.


#### 3. How well did you meet the requirements as set out in the challenge? What requirements did you not meet correctly (if any)?

--> I did meet the requirmenets but there was one problem I had is when I change the checkerboard by selected size like 8x8 to 3x3, 10x10 or 16x16 the last row

checker boards be cut around half size for the first time but did work well if I changed again. I think my changelistener was not

well formed. (I calculated the size well. by doing minus menubar size.) I coded changelisner part too complicated.

#### 4. How well does your solution match the posted solution? What is different?

--> The answer made the method renderBoard() and selectSize(ActionEvent event) so seperated the code which was a one of the

huge differences between my code and answer code. I think the idea is same but I put all the information on the parameters like

this.stage.getScene().getWidth() which makes too complicated.

#### 5. How could you improve going forward? What don't you still understand that was required for the challenge?

--> Absoultey I need to improve readability when I code something. Need to code more stuctured and organized way.

I am still not understand why the code doesnt work. I mean I calculated well the height and wieght but when I change the

board size the last row board size got cut around half and then it sets well when I drag the size of scene. 
