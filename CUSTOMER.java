public class CUSTOMER
{
    // lsit of properties
    private String CustomerID;
    private char TicketID;
    private int NumOfTickets;
    private char method;
    public float total;
    public char getnight;
    public String SeatSection;

    public CUSTOMER()
    {
        CustomerID = "";
        TicketID = 0;
        NumOfTickets = 0;
        method = 0;

    }

    public void readCustomerDetails (String dataItems)
    {
        String [] rowItems = dataItems.split(",");
        CustomerID = rowItems [0];
        TicketID = (rowItems[1]).charAt(0);
        SeatSection = (rowItems[1]);
        NumOfTickets = Integer.parseInt(rowItems[2]);
        method = (rowItems[3]).charAt(0);
    }

    public String writeDetails()
    {
        String customerData = "";
        customerData = customerData.concat(CustomerID);
        customerData = customerData.concat(",");
        customerData = customerData.concat(SeatSection);
        customerData = customerData.concat(",");
        customerData = customerData.concat(Integer.toString(NumOfTickets));
        customerData =customerData.concat(",");
        customerData = customerData.concat(Character.toString(method));
        return customerData;
    }

    public char getmethod() 
    {
        return method;
    }

    public char getnight() 
    {
        return TicketID;
    }
    
    public int getNumOfTickets() 
    { return NumOfTickets; 
    }
    }