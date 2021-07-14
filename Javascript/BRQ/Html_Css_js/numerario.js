function calcularNumerario(){
    var id = parseInt(document.getElementById('id').value)
    var hora = parseInt(document.getElementById('horas').value)
    var shora = parseInt(document.getElementById('salario').value)
    var stotal = hora * shora

    while(stotal > 0){
        n200 = Math.floor(stotal / 200)
        stotal = stotal % 200

        n100 = Math.floor(stotal / 100)
        stotal = stotal % 100

        n50 = Math.floor(stotal / 50)
        stotal = stotal % 50

        n20 = Math.floor(stotal / 20)
        stotal = stotal % 20

        n10 = Math.floor(stotal / 10)
        stotal = stotal % 10

        n5 = Math.floor(stotal / 5)
        stotal = stotal % 5

        n2 = Math.floor(stotal / 2)
        stotal = stotal % 2

        m1 = Math.floor(stotal / 1)
        stotal = stotal % 1
    }
   
    

    document.getElementById('m1').innerHTML = m1
    document.getElementById('n2').innerHTML = n2
    document.getElementById('n5').innerHTML = n5
    document.getElementById('n10').innerHTML = n10
    document.getElementById('n20').innerHTML = n20
    document.getElementById('n50').innerHTML = n50
    document.getElementById('n100').innerHTML = n100
    document.getElementById('n200').innerHTML = n200
 

}

