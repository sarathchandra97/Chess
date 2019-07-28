import java.util.*;
class Board{
    HashMap<Position, Piece> board = new HashMap();  
    Boolean isAvaliable(Position position ){
        if( position.x < 0 || position.y < 0 )
        return false; 
        if( position.x > 7 || position.y > 7 )
        return false ;
        return true ; 
    }
}