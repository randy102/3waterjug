package PathFinding;

/* 
    Nguyen Tuan Dang
    Faculty of Information Technology, Saigon University
    dangnt@sgu.edu.vn
*/

public class Map {
    Point map[][];
    
    public Map(){
        map = new Point[4][8];
        
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 8; j++)
                map[i][j] = new Point();
    }
}
