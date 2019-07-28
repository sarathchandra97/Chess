class Knight extends Piece{
    ArrayList<Position> getAllPossiblePosition(){
        ArrayList<Position> positions = new ArrayList<Position>(); 
        // add all positions of the Knight 
        addPosition(positions, createTempPosition(1,3));
        addPosition(positions, createTempPosition(1,-3));
        addPosition(positions, createTempPosition(-1,3));
        addPosition(positions, createTempPosition(-1,-3));
        addPosition(positions, createTempPosition(3,1));
        addPosition(positions, createTempPosition(3,-1));
        addPosition(positions, createTempPosition(-3,1));
        addPosition(positions, createTempPosition(-3,-1));
        return positions;
    }
    Knight(){
        this.type = Type.Knight;
    }
}