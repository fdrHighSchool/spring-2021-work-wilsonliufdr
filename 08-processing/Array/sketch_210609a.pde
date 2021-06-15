int[] nums = new int[10];

void setup() {
  size(500, 500);
}

void draw(){
   for (int i = 0; i < nums.length; i++) {
    nums[i] = 100 - (i * 10);
  }
  int j = int(random(0, 500));
  int k = int(random(0, 500));
  for (int i = 0; i < nums.length; i++) {
    circle(j, k, nums[i]);
    fill(int(random(0, 250)),int(random(0, 250)),int(random(0, 250)));
  }
}
