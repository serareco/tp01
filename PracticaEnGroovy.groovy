// Practicando con Groovy!
def nombre = 'Sergio'
// Imprimiendo lineas
println "Hola $nombre"
println 'Hola $nombre'

println '''Hola esto es
un texto de varias
lineas!'''

println '''Hola $nombre esto es
un texto de varias
lineas!'''

println """Hola $nombre esto es
un texto de varias
lineas!"""

def arr_a = [1,1,2,3,5,8]

arr_a.each{ entry ->
    println entry
}

def arr_b = [5..15]

arr_b.each{ println "$it" }
(5..15).each{ println "$it" }


// Siempre se trabaja con objetos
// 5 + 5
// 5 es un objeto
// 5.plus(5)

1.upto(10){ entry ->
    println entry
}

10.downto(1){ entry ->
    println entry
}

def arr_string = ['a'..'z']
arr_string.each{ println "$it" }

def lista = [0,1,5,8,24,3]

println lista
println lista[2]
println lista[2..4]

println 'hola amigos!'[2..4] // Selecciona las posiones 2..4

println lista.pop() // Saca el ultimo

//println lista.push(4) // Pone un elemento al final

println lista

println lista.collect{ item -> item * 2 } // collect recolectar la lista, lo mete en item

println lista.findAll{ item -> item % 2 == 0} // find all busca en la lista, los que cumple la condicion de Closure -- Si no quiero usar nombre de variable uso 

println lista.find{ item -> item % 2 == 0}

println lista.reverse()

println lista.findAll{ item -> item % 2 == 0}.sum()

def dir = new File('C:/')

/* def status

dir.eachFile { 
    if (it.isFile()) {
        println it.canonicalPath
        println it.name.endsWith('.txt')
        println it.name.
        fileType = it [it.length]
        status[fileType] = ++
    }
}
*/

def tiposAContar = [
'.bat' : 0,
'.txt' : 0,
'.ini' : 0,
'.sys' : 0,
'.exe' : 0,
'.dll' : 0,
'.bmp' : 0,
'.cab' : 0,
'.MSI' : 0 ]

dir.eachFile { 
    if (it.isFile() && it.canonicalPath.lastIndexOf('.') != -1) {
       println it.canonicalPath
       tiposAContar[it.canonicalPath [(it.canonicalPath.lastIndexOf('.'))..-1]] = tiposAContar[it.canonicalPath [(it.canonicalPath.lastIndexOf('.'))..-1]] + 1 
       //println it.lastIndexOf('.')
    }
}

println 'Cantidad de archivos por tipo'
println '-----------'
println "TXT : " + tiposAContar['.txt']
println "BAT : " + tiposAContar['.bat']
println "MSI : " + tiposAContar['.MSI']
println "SYS : " + tiposAContar['.sys']
println "INI : " + tiposAContar['.ini']
println "DLL : " + tiposAContar['.dll']
println "BMP : " + tiposAContar['.bmp']
println "CAB : " + tiposAContar['.cab']
println "EXE : " + tiposAContar['.exe']




