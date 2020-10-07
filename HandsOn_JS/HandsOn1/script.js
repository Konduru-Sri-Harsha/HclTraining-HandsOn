
const eventarray = [];

function addEvent() {
    
    let eventname = document.getElementById("eventName").value;
    if (eventarray.length === 0) {
        eventarray.push(eventname);
        document.getElementById("successMessage").innerHTML = "Event name added successfully";

    }
   
     else {
        let count = 0;
        for (let i = 0; i < eventarray.length; i++) {

            if (eventarray[i] === eventname)
                count++;

        }

        if (count > 0)
            document.getElementById("successMessage").innerHTML = "Event name alreadt exists. Try with some other name";
        else {
            eventarray.push(eventname);
            document.getElementById("successMessage").innerHTML = "Event name added successfully";

        } 
    }
    document.getElementById("eventName").value=""; 
   
} 



function displayEvent() {
    document.getElementById("successMessage").innerHTML ="";
    
    document.getElementById("resultTable").innerHTML ="<tr> <th>"+"Event Name"+"</th></tr>";
    for (let i = 0; i < eventarray.length; i++) {
        
        document.getElementById("resultTable").innerHTML +=
            "<tr><td>" + eventarray[i] + "</td></tr>";
    }

    

}




