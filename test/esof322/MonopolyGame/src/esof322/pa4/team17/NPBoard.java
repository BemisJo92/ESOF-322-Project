
package esof322.pa4.team17;

public class NPBoard extends Board{
    final String theme = "NP";
    public NPBoard(int totalPlayers, GUI g) {
        super(totalPlayers, g);
        this.createTiles();
    }
    
    @Override
    public void createTiles()
    {
        for(int tilePos = 0; tilePos < tiles.length; tilePos++)
        {
            switch(tilePos)
            {
                case 0: // GO tile
                    tiles[tilePos] = new GoTile("GO",440,440);  //make sure correct format with tile class
                    break;
                case 1: 
                    tiles[tilePos] = new PropertyTile("Cuyahoga Valley",400,440,60,2,10,30,90,160,250,50,50,30);   //format for PropertyTile: name,buy price,rent, rent with 1 house,2,3,4,1 hotet, house cost, hotel cost(w/4 houses), mortgage value
                    break;
                case 2: //first community chest
                    tiles[tilePos] = new CommunityChestTile("CommunityChest1",360,440);
                    break;
                case 3: 
                    tiles[tilePos] = new PropertyTile("Joshua Tree",320,440,60,4,20,60,180,320,450,50,50,30);
                    break;
                case 4://income tax
                    tiles[tilePos] = new IncomeTaxTile("Income Tax",280,440);
                    break;
                case 5:
                    tiles[tilePos] = new RailroadTile("Nature Hiking",240,440);                           
                    break;
                case 6:
                    tiles[tilePos] = new PropertyTile("Death Valley", 200, 440,100,6,30,90,270,400,550,50,50,50);
                    break;
                case 7:     //first chance
                    tiles[tilePos] = new ChanceTile("Historic Site (Chance) 1",160,440);
                    break;
                case 8:                        
                    tiles[tilePos] = new PropertyTile("Arches",120,440,100,6,30,90,270,400,550,50,50,50);
                    break;
                case 9:
                    tiles[tilePos] = new PropertyTile("Redwood",80,440,120, 8,40,100,300,450,600,50,50,60);
                    break;
                case 10:    //jail
                    tiles[tilePos] = new JailTile("Jail",40,440);
                    break;
                case 11:
                    tiles[tilePos] = new PropertyTile("Big Bend",40,400, 140,10,50,150,450,625,750,100,100,70);
                    break;
                case 12:   //electric company tile
                    tiles[tilePos] = new UtilityTile("Volcano (Electric Company)",40,360);
                    break;
                case 13:
                    tiles[tilePos] = new PropertyTile("Olympic",40, 320, 140, 10,50,150,450,625,750,100,100,70);
                    break;
                case 14:
                    tiles[tilePos] = new PropertyTile("Great Smokey Mountians",40, 280,160, 12,60,180,500,700,900,100,100,80);
                    break; 
                case 15:
                    tiles[tilePos] = new RailroadTile("Rockclimbing (Railroad)",40,240);  
                    break;
                case 16:
                    tiles[tilePos] = new PropertyTile("Everglades",40, 200,180, 14,70,200,550,750,950,100,100,90);
                    break;
                case 17:    //2nd community chest
                    tiles[tilePos] = new CommunityChestTile("Battlefield (Chest2)",40,160);
                    break;
                case 18:
                    tiles[tilePos] = new PropertyTile("Carlshad Caverns",40,120, 180,14,70,200,550,750,950,100,100,90);
                    break;
                case 19:
                    tiles[tilePos] = new PropertyTile("Grand Teton",40,80,200,16,80,220,600,800,1000,100,100,100);
                    break;
                case 20:    //free parking
                    tiles[tilePos] = new FreeParkingTile("Freeparking",40,40);
                    break;
                case 21:
                    tiles[tilePos] = new PropertyTile("Acadia",80,40, 220, 18,90,250,700,875,1050,150,150,110);
                    break;
                case 22:       //2nd chance
                    tiles[tilePos] = new ChanceTile("Historic (Chance 2)",120,40);
                    break;
                case 23:
                    tiles[tilePos] = new PropertyTile("Bryce Canyon",160,40, 220, 18,90,250,700,875,1050,150,150,110);
                    break; 
                case 24:
                    tiles[tilePos] = new PropertyTile("Zion",200,40, 240,20,100,300,750,925,1100,150,150,120);
                    break;
                case 25:
                    tiles[tilePos] = new RailroadTile("Bicycling (Railroad)",240,40);
                    break;
                case 26:
                    tiles[tilePos] = new PropertyTile("Grand Canyon",280,40, 260,22,110,330,800,975,1150,150,150,130);
                    break;
                case 27:
                    tiles[tilePos] = new PropertyTile("Denali",320,40, 260,22,110,330,800,975,1150,150,150,130);
                    break;
                case 28:
                    tiles[tilePos] = new UtilityTile("Geyser (Utility)",360,40);
                    break;
                case 29:
                    tiles[tilePos] = new PropertyTile("Rocky Mountian",400,40, 280,24,130,360,850,1025,1200,150,150,140);
                    break;
                case 30:    //go to jail
                    tiles[tilePos] = new GoToJailTile("GO to Jail",440,40);
                    break;
                case 31:
                    tiles[tilePos] = new PropertyTile("Glacier",440,80, 300, 26,130,390,900,1100,1275,200,200,150);
                    break;
                case 32:
                    tiles[tilePos] = new PropertyTile("Mount Rainier",440,120, 300, 26, 130,390,900,1100,1275,200,200,150);
                    break;
                case 33:   //3rd community chest
                    tiles[tilePos] = new CommunityChestTile("Battlefield (chest 3)",440,160);
                    break;
                case 34:
                    tiles[tilePos] = new PropertyTile("Sequoia",440, 200,320,28,150,450,1000,1200,1400,200,200,160);
                    break;
                case 35:
                    tiles[tilePos] = new RailroadTile("River Rafting (railroad)",440,240);
                    break;
                case 36:    //3rd chance
                    tiles[tilePos] = new ChanceTile("Historic (Chance 3)",440,280);
                    break;
                case 37:
                    tiles[tilePos] = new PropertyTile("Yosemite",440,320, 350,35,175,500,1100,1300,1500,200,200,175);
                    break;
                case 38:
                    tiles[tilePos] = new LuxuryTaxTile("Purchase annual Pass (Luxury Tax)",440,360);
                    break;
                case 39:
                    tiles[tilePos] = new PropertyTile("Yellowstone",440,400, 400,50,200,600,1400,1700,2000,200,200,200);
                    break;
            }
        }
    }
    
}
