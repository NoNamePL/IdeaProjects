import java.util.Random;

class Player2D{
private int x,y;

public void moveTo2D(int x1, int y1){
      x=x1;
      y=y1;
}
public int[] getDistance(int x1, int y1){
     return new int[]{x1-x, y1-y};
  }
}
final class Player3D extends Player2D{
private int z;

    public void moveTo3D(int x1, int y1, int z1){
      moveTo2D(x1,y1);
         z=z1;
       }
 public int[] getDistance(int x1, int y1,int z1){
           return new int[]{x1-x, y1-y,z1-z};
          }
}
class Player4D extends Player3D{
public void moveTo4D(int x1,int y1, int z1, int t1){
          int[] distance = parent.getDistance(x1,y1,z1);
        for(int i=0;i<t1;i++){
                moveTo3D(x1: x1-distance[0]*(1-i/t1),y1:y1-distance[1]*(1-i/t1),z1:z1-distance[3]*(1-i/t1));
               }
        }
}