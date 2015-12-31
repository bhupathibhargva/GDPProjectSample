        
            
            function myFunction() 
            {
                     $(document).ready(function () 
                    {
                        $('#PersonTableContainer').jtable
                        (
                                {
                            title: 'Student History',
                           
                           actions: {

                                    listAction: 'testing2?action=list',
                                    },
                            fields: 
                                    {
                                studentKey: {
                                    title: 'Student Key',
                                    width: '30%'
                                },
                                courseNum: {
                                    title: 'Course Number',
                                    width: '30%'
                                }
                
                                
                            }
                        });
                        $('#PersonTableContainer').jtable('load');
                    });
           }
               
            
       