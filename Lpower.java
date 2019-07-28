class Lpower extends Power{
 /*
 It need Board access to check the border conditions 
 It means It neeed Board object to understand the positon or check the possible positions 
 There are three options 
 1. should i pass it as a function parameter 
        dis : function parameters will increase it will look odd
 2. should i get the instance by call the main function 
        dis : It function have the direct actions
 3. should i call back the same function to know what is the status of the object 
        dis : It will call back i think when we are understanding the flow look tough and odd
 4. create a new class which will give a access to the board object
 */
  PowerType powerType = PowerType.Lpower;
  ArrayList<position> positions = new ArrayList<position>();
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
    //

}   
} 