package jalau.at18.battlecity;

public class MissileCollision {
    private Empty empty = new Empty();

    public boolean isElementHit(Element[][] matrix, int row1, int column1, int row2, int column2) {

        Element element1 = matrix[row1][column1];
        Element element2 = matrix[row2][column2];

        if (!element1.isAllowPassBullet()) {
            if (element1.getType() == ElementType.BRICK) {
                element1.reduceLive(1);
                element2.reduceLive(1);
                System.out.println("Bullet hit the brick");
                if (element1.getLive() == 0) {
                    matrix[row1][column1] = empty;
                    matrix[row2][column2] = empty;
                    System.out.println("Brick was destroyed, hs not live");
                }
            }
            return true;
        }
        return false;
    }
}
