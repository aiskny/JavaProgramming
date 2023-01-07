package day40_FinalKeyword;

import day39_Recap.areaOfShapes.Circle;

public class EncapsulationReview {
    private Circle circle;
    public Circle getCircle(){
        return circle;
    }

    public void setCircle(){
      if (circle.getRadius()<5){
          return;
      }
      this.circle = circle;
    }
}
