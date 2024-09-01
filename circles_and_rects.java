int circlebuttonX, circlebuttonY, circlebuttonWidth, circlebuttonHeight;
int rectbuttonX, rectbuttonY, rectbuttonWidth, rectbuttonHeight;

void setup() {
  fullScreen(P2D, 2);
  background(0);
  noStroke();
  fill(102);
  circlebuttonX = 100;
  circlebuttonY = 100;
  circlebuttonWidth = 200;
  circlebuttonHeight = 50;
  
  rectbuttonX = 100;
  rectbuttonY = 200;
  rectbuttonWidth = 200;
  rectbuttonHeight = 50;
}

void draw() {
  // Draw the buttons
  fill(255);
  rect(circlebuttonX, circlebuttonY, circlebuttonWidth, circlebuttonHeight);
  rect(rectbuttonX, rectbuttonY, rectbuttonWidth, rectbuttonHeight);

  // Check if the mouse is over the button
  if (mouseX > circlebuttonX && mouseX < circlebuttonX + circlebuttonWidth && 
    mouseY > circlebuttonY && mouseY < circlebuttonY + circlebuttonHeight) {
    fill(0, 255, 0); // Change the color on hover
  } else {
    fill(0);
  }
  
  if (mouseX > rectbuttonX && mouseX < rectbuttonX + rectbuttonWidth && 
    mouseY > rectbuttonY && mouseY < rectbuttonY + rectbuttonHeight) {
    fill(0, 255, 0); // Change the color on hover
  } else {
    fill(0);
  }

  // Draw the button text
  textAlign(CENTER, CENTER);
  text("Generate Circles", circlebuttonX + circlebuttonWidth/2, circlebuttonY + circlebuttonHeight/2);
  text("Generate Squares", rectbuttonX + rectbuttonWidth/2, rectbuttonY + rectbuttonHeight/2);

  if (mousePressed) {
  float x = random(width);
  float y = random(height);
  
  if (mouseX > circlebuttonX && mouseX < circlebuttonX + circlebuttonWidth && 
      mouseY > circlebuttonY && mouseY < circlebuttonY + circlebuttonHeight) {
    fill(random(255), random(255), random(255));
    ellipse(x, y, 50, 50);
   }
   
  if (mouseX > rectbuttonX && mouseX < rectbuttonX + rectbuttonWidth && 
      mouseY > rectbuttonY && mouseY < rectbuttonY + rectbuttonHeight) {
    fill(random(255), random(255), random(255));
    rect(x, y, 50, 50);
    }
  }
}
