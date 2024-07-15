import java.io.*;
import java.util.Scanner;

public class StormChaser {
    public static void main(String[] args) {
        // Constants
        final int MAX_STORMS = 500;
        Storm[] stormsArray = new Storm[MAX_STORMS];
        // Storm [MAX_STORMS] List;  // array of Storms
        Storm CurrentStorm;      // storm returned by GetStorm
        int NStorms = 0;         // number in array List
        int Total = 0;           // total number of storms in the input file
        Scanner fileInput;

        // Opening hurricane data file
        try {
            System.out.println("Opening hurricane data file...");
            fileInput = new Scanner(new File("C:\\Users\\yuriy\\IdeaProjects\\FirstSemesterProject\\src\\hurricane.data"));
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException: " + e.getMessage());
            return;
        }
        System.out.println("File opened successfully...");
        System.out.println("Reading file...");

        // Read Storm data from file until EOF
        while (fileInput.hasNextLine()) {
            CurrentStorm = GetStorm(fileInput);

           // System.out.println("------------storms: " + CurrentStorm.toStringSimple());

            stormsArray[Total] = CurrentStorm;
            ++Total;
        }
        fileInput.close();

        System.out.println("Number of storms: " + Total);
        for (int i = 0; i < Total; i++) {
            // Calculating wind and setting category.
            stormsArray[i].SaffirSimpson();
            System.out.println(i + ") " + stormsArray[i].toString());
        }

        System.out.println("Storms of category 3 or higher: ");
        for (int i = 0; i < Total; i++) {
            if (stormsArray[i].getCategory() >= 3) {
                System.out.println(i + ") " + stormsArray[i].toString());
            }
        }



        System.out.println( "Hurricanes with category 3 and above: " + NStorms );
        DisplayStorms( "First Ten Storms", stormsArray, 10 );
           Sort( stormsArray, NStorms );
        DisplayStorms( "Top Ten Storms", stormsArray, 10 );
    }
    public static Storm GetStorm( Scanner in )
    {
        // Build a Storm object and return it
        int year = 0, month = 0, day = 0, hour = 0;
        int sequence = 0, wind = 0, pressure = 0;
        String name = "";
        int current = 0, beginDate = 0, duration = 0;
        Storm NewStorm = new Storm(0,0,"",0,0);
       // Read next record.
// Make a storm object and initialize it with info from the current record
            String currentStr = in.nextLine();
           // System.out.println("I am here reading first line of new storm  ...");
           // System.out.println(currentStr);
            year = Integer.parseInt(currentStr.substring(0, 4));
            month = Integer.parseInt(currentStr.substring(5, 7).trim());
            day = Integer.parseInt(currentStr.substring(8, 10).trim());
            sequence = Integer.parseInt(currentStr.substring(14, 16).trim());
            name = currentStr.substring(17, 27).trim();
            beginDate = makeDate(year, month, day);
            wind =  Integer.parseInt(currentStr.substring(41, 43).trim());
            pressure = Integer.parseInt(currentStr.substring(44, 48).trim());
            //System.out.println("Creating obj <" + name + "> duration = " + duration);
            NewStorm = new Storm(beginDate, duration, name, wind, pressure);

            current = sequence;


            while( in.hasNextLine()) {
                String nextStr = in.nextLine();
                int newSeq = Integer.parseInt(nextStr.substring(14, 16).trim());

                if (current == newSeq) {
                    // this is the same storm
                   // System.out.println("              reading next line for the SAME storm " + nextStr.substring(17, 27).trim());
                    //System.out.println(nextStr);
                    int yearNext = Integer.parseInt(nextStr.substring(0, 4));
                    int monthNext = Integer.parseInt(nextStr.substring(5, 7).trim());
                    int dayNext = Integer.parseInt(nextStr.substring(8, 10).trim());
                    int sequenceNext = Integer.parseInt(nextStr.substring(14, 16).trim());
                    name = nextStr.substring(17, 27).trim();
                    int bDayNext = makeDate(yearNext, monthNext, dayNext);
                    int dur = bDayNext - beginDate;
                    int windNext =  Integer.parseInt(nextStr.substring(41, 43).trim());
                    if(windNext > NewStorm.getWind()) {
                        NewStorm.setWind(windNext);
                    //    System.out.println("Wind is updated to new value: " + windNext);
                    }
                    int nextPressure = Integer.parseInt(nextStr.substring(44, 48).trim());
                    if(nextPressure < NewStorm.getPressure()) {
                        NewStorm.setPressure(nextPressure);
                    }
                    NewStorm.setDuration(dur);
                   // System.out.println("            Updating obj <" + NewStorm.getName() + ">  current = " + current + " duration now = " + NewStorm.getDuration());
                }
                else return NewStorm;
            }
            return NewStorm;
        // and return the new storm object
    }
    public static int makeDate( int y, int m, int d ){
       return  y * 10000 + m * 100 + d;
    }

    public static void DisplayStorms( String title, Storm[] List, int NStorms )
    {
        // display NStorms storms
        // print some title and column headings
        System.out.println(title + "\n");
        System.out.println("Begin Date   Duration   Name   Category   Maximum Minimum");
        System.out.println("             (hours)                     Winds (mph) Press. (mb)");
        System.out.println("--------------------------------------------------------------- -");
        int count = 0;

            for( int k = 0; k < List.length; k++ ) {
                if (count == 10) return;
                if (List[k].getCategory() >= 3){
                    count++;
                    System.out.println(List[k].toString());
                    }
                }
        System.out.println ("\n");
    }

    public static void Sort( Storm[] StormList, int N )
    {
// bubble sort the list of Storms
        int pass = 0, k, switches;
        Storm temp;
        switches = 1;
        while( switches != 0 )
        {
            switches = 0;
            pass++;
            for( k = 0; k < N - pass; k++ )
            {
                if( StormList[k].getCategory() < StormList[k+1].getCategory() )
                {
                    temp = StormList[k];
                    StormList[k] = StormList[k+1];
                    StormList[k+1] = temp;
                    switches = 1;
                }
            }
        }
    }
}
