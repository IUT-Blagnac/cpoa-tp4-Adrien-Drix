package application;

import application.action.AgenceBancaire;

public class  ApplicationContextAgenceBancaire {
    AgenceBancaire monAg = new AgenceBancaire();

    private ApplicationContextAgenceBancaire() { }

    public AgenceBancaire getInstance() {
        return monAg;
    }

    public void useInput(String inputType, var inputVal) {

        switch (inputType) {
            case "file":
                // TODO : open a file manager
                break;
            
            case "bash":
                // TODO : open a terminal
                break;
            default:
                Scanner myScanner = new Scanner(System.in);

                inputVal = myScanner.nextLine();
                break;
        }

        return inputVal;
    }

    public void useOuput(String outputType, var outputType) {

        switch (inputType) {
            case "file":
                // TODO : open a file manager
                break;
            
            case "bash":
                // TODO : open a terminal
                break;
            default:
                System.out.println(outputType);
                break;
        }

        return outputType;
    }
}