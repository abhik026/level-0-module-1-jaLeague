int x = 400; 
int y = 600; 

void setup() {

     size(800, 800);

}

void draw() {
    background(0, 0, 40);
    fill(#E0D7D7);
    ellipse(100,100,100,100);
    fill(#908383);
    noStroke();
    ellipse(80,90,20,20);
    ellipse(100,120,40,40);
    ellipse(120,80,30,30);
    fill(random(255), 0, 0);
    ellipse(x, y + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + 95, 35, 35);
    fill(100, 100, 100);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
    if(mousePressed){
    y-=5;
}}
