int totalFrames = 120;
int counter = 0;

void setup(){
    size(400,400);

}

void draw(){
    float percent = float(counter) / totalFrames;
    render(percent);
    counter++;
    
}

void render(float percent){
    background(0);
    ellipse(percent*width, height/2, 20, 20);
}