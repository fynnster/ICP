package labs;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fynnba Biney
 */
public class rectangle {
      int length;
      int breadth;

    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
     //methods to set the length and breath of the rectangle
    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    
      //method to calculate area of rectangle
      int area()
      {
        int rectArea;
        rectArea = length * breadth;
        return rectArea;
      }
      //method to calculate perimeter of rectangle
      int perimeter()
      {
        int rectperimeter;
        rectperimeter = 2*(length + breadth);
        return rectperimeter;
      }
      
      public static void main(String[] args){
          
          rectangle newRectangle = new rectangle(2,4);
          
          System.out.println("Area = " + newRectangle.area() + " POerimeter = " + newRectangle.perimeter());
      }
      
}