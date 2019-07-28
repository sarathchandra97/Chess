class Piece{
    Color color ;
    Type type ;
    Boolaen dead ;
    Position position ;
    Boolean isDead(){
        return dead;
    }
    void kill(){
        this.dead = true ;
    }
    void updatePosition(Position position){
        this.position = position ; 
    }
    void setPosition(Position position ){
        this.position = position ; 
    }
    Position getPosition(){
        return this.position ;
    }
    void addPosition(ArrayList<Position> positions, position){
        Board board = Board.getInstanceBoard();
        if(board.isAvailable(position))
        positions.add(position);
        return position;
    }
    Position createTempPosition Position(1,3){
        Position currentPosition = this.position;
        int updatedX = currentPosition.x;
        int updatedY = currentPosition.y; 
        return new Position(updatedX, updatedY); 
    }
}