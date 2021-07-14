function addAno(){

    ano = parseInt(document.getElementById('ano').value);
    X=24;
    Y=5;
    a=ano % 19;
    b=ano % 4;
    c=ano % 7;
     d=(19* a + X) % 30
    e=(2*b + 4 * c + 6 * d + Y) % 7
    soma=d+e

    if(soma > 9) {
        dia = (d + e -9)
        mes = "Abril"
        pascoa = dia + " " + mes
        document.getElementById("pascoa").innerHTML = "A páscoa será em: " + dia + " de " +mes
    }else{
        dia = (d + e +22)
        mes = "Março"
        pascoa = dia + " " + mes
        document.getElementById("pascoa").innerHTML = "A páscoa será em: " + dia + " de " +mes
    }
function removeAno(){
    
}

}

