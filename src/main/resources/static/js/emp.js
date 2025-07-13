function updateDesignations(){
	const department=document.getElementById("department").value;
	const designation=document.getElementById("designation");
	designation.innerHTML='';
	let options=[];
	if(department==='Development'){
		options=['Software Engineer','Senior Developer','Team Lead'];
		
	}
	else if(department==='QA & Automation Testing'){
		options=['QA Engineer','Automation Engineer','Test Lead'];
   }
   else if(department==='Networking'){
   		options=['Network Engineer','System Administrator'];
      }
      
else if(department==='HR Team'){
	  options=['HR Executive','HR Manager','Recruiter'];
	    }
	     
else if(department==='Security'){
		options=['Security Officer','Security Analyst'];
		 }
		    
	else if(department==='Sales & Marketing'){
	options=['Sales Executive','Marketing Manager'];
	 }
			
	 
	 options.forEach(function(designationValue){
		const option =document.createElement("option");
		option.value=designationValue;
		option.text=designationValue;
		designation.appendChild(option);
	 });
	 
	 
	 const defaultOption=document.createElement("option");
	 defaultOption.selected=true;
	 defaultOption.text="Select Designation";
	 designation.insertBefore(defaultOption,designation,firstChild);   					 
		 
		 	  
   

}
function editRecord(id){
window.location.href=`/edit-record?id=${id}`;
}

function deleteRecordById(id) {
    Swal.fire({
        title: 'Are you sure?',
        text: "This action cannot be undone!",
        icon: 'warning',
        showCancelButton: true,
        confirmButtonColor: '#d33',
        cancelButtonColor: '#3085d6',
        confirmButtonText: 'Yes, delete it!'
    }).then((result) => {
        if (result.isConfirmed) {
            // Proceed to delete
            window.location.href = `/deleteRecord-byId?id=${id}`;
        }
    });
}


function approved(id,type) {
    Swal.fire({
        title: 'Are you sure?',
        text: "Do you want to " + type,
        icon: 'warning',
        showCancelButton: true,
        confirmButtonColor: '#d33',
        cancelButtonColor: '#3085d6',
        confirmButtonText: 'Yes'
    }).then((result) => {
        if (result.isConfirmed) {
            // Proceed to delete
            window.location.href = `/approve-byId?id=${id}&type=${type}`;
        }
    });
}

