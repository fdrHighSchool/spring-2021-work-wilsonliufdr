void setup() {
  size(500,500);
}

int x = 0;
int y = 0;

void draw() {
  strokeWeight(10);
  point(x,y);
  stroke(126);
}

void mouseMoved() {
  x = mouseX;
  y = mouseY;
}
