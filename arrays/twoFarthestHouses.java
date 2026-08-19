class Solution { 
    public int maxDistance(int[] colors) { 
        int a = 0; 

        if (colors[0] != colors[colors.length - 1]) { 
            return colors.length - 1; 
        } 
 
        for (int i = 0; i < colors.length; i++) { 
            if (colors[i] != colors[0]) { 
                a = i; 
                break; 
            } 
        } 
 
        int b = colors.length - 1; 
        
        for (int i = colors.length - 1; i >= 0; i--) {  
            if (colors[i] != colors[colors.length - 1]) { 
                b = i; 
                break;
            } 
        } 
 
        int distance = b;
        int dist = (colors.length - 1) - a; 
 
        return Math.max(distance, dist); 
    } 
}

//First, check whether the first and last houses have different colors.
//If yes, they are the farthest possible houses.
//Return colors.length - 1.
//a stores the index of the first house from the left whose color is different from the first house.
//We use break because we want the first different color from the left.
//b stores the index of the first different house when searching from the right.
//We use break again because we want the first different color encountered from the right.
//distance = b
//This represents the distance between index 0 and index b.
//dist = (colors.length - 1) - a
//This represents the distance between index a and the last index.
//Finally, Math.max(distance, dist) returns the larger of the two possible maximum distances.