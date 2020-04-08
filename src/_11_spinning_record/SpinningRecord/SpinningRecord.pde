import ddf.minim.*;             //at the very top of your sketch
  Minim minim;        //as a member variable
  AudioPlayer song;      //as a member variable
PImage pictureOfRecord;           
int imageAngle = 0;//as member variable
void setup(){
         size(600,600);                                 //in setup method
        pictureOfRecord= loadImage("record.png");    
        pictureOfRecord.resize(height,width);    
         minim = new Minim(this);    //in the setup method
  song = minim.loadFile("awesomeTrack.mp3", 512);   //in the setup method//in setup method//in setup method
}
void draw() {
  image(pictureOfRecord, 0, 0);  //in draw method
  imageAngle+=3;
  if(mousePressed){
 rotateImage(pictureOfRecord, imageAngle);
 image(pictureOfRecord, 0, 0);  //in draw method


  }
  //add the sound later...
        
}
void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
