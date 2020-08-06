 PImage pineapple;
 PImage olive;
void setup() {
    size(400,400);
    background(#FFFFFF);
    olive = loadImage("olives.jpg");
    pineapple = loadImage("pineapple.jpg");
    noStroke();
    fill(#E5CB86);
    ellipse(200,200,300,300);
    fill(#E32C22);
    ellipse(200,200,265,265);
    fill(#E0CF30);
    ellipse(200,200,245,245);
    pineapple.resize(45,45);
    olive.resize(45,45);
}
void draw() {
    if(mousePressed){
      image(pineapple,100,100);
    image(olive,200,100);
    image(pineapple,60,130);
    image(olive,300,108);
    image(pineapple,100,100);
    image(olive,200,100); image(pineapple,100,100);
    image(olive,125,147);
    }
    
    
}
