int rainY;
int rainX;
int score= 0;
void setup(){
  size(400,600);
  background(0, 500, 130);

    rainX = (int) random(10, 390);
}
void draw() {
    background(0, 500, 130);
    fill(50, 0, 0);
    stroke(0, 0, 0);
    rect(mouseX, 590, 15, 10);
      fill(0, 0, 900);
  stroke(0, 0 , 100);
if (rainY >= 600){
      rainX = (int) random(10, 390);
      rainY = 0;
}
  
ellipse(rainX, rainY, 5, 9);
  rainY+=5;
checkCatch(rainX);
 fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}
void checkCatch(int x){
         if (rainY == 590 && x > mouseX && x < mouseX+15)
            score++;
      else if( rainY == 590 && x != mouseX && x != mouseX+15)
      score--;
        println("Your score is now: " + score);
    }
