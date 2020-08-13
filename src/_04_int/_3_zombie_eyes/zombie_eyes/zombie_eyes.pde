PImage face;
void setup() {
face = loadImage("faces.jpg");
size(500,500);
face.resize(width,height+40);

}
void draw() {
image(face,0,0);
fill(mouseX,mouseY,mouseX+mouseY);
ellipse(190,280,90,90);
ellipse(310,280,90,90);
fill(0,0,0);
ellipse(190,280, 10,10);
ellipse(310,280,10,10);
}
