int Yvariable;
int Xvariable;
void setup(){
size(600, 400);

  
}
void draw(){
  background(0, 0, 0);
  makeMagical();
  for(int i =0; i < 300; i++){
    Yvariable = (int) random(50, 350);
    Xvariable = (int) random(50, 550);
    fill (0, i, frameCount);
    stroke(70, 0, 0);
   ellipse(getWormX(i), getWormY(i), 4, 4);
  }
  
  
}
float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
