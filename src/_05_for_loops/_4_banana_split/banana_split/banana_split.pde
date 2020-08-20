void setup(){
size(400,400);


}

void draw(){
fill(mouseX,mouseY,mouseX);
rect(width/2-150,height/2-150,300,300);

fill(0,0,0);

for(int i =0; i<3; i++){
text("Ice Cream", 165,125+ i*50);
}
text("Banana",165,275);
}
