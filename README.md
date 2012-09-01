Se utilizaron los siguientes comandos:
----------------------------------------------------------------------
--------------------> Usando git local <------------------------------
----------------------------------------------------------------------
-- Configuracion personal
----------------------------------------------------------------------

git config --global user.name "Sergio Areco"

git config --global user.mail "sergio_areco@hotmail.com"

git config --global color.ui true

----------------------------------------------------------------------
-- Configuracion y uso local
----------------------------------------------------------------------

-- Inicia Repositorio local
git init C:/Users/Sergio/TallerWebIIJava/RepoGit/tp01/

-- Estado del repositorio
git status

-- Agrego todo lo que está pendiente al area de trabajo
git add .

-- Agrego archivo al area de trabajo
git add fileName

-- Commit de los archivos en el area de trabajo
git commit -m "Commit inicial"

-- Con estos parametros de Commit se confirman los cambios del Merge
git commit -am "se soluciona problema de Merge automatico"

-- Moverse entre branchs existentes
git checkout BranchDestino

-- Creando branch --> Copia desde donde estoy, para generar nuevos desarrollos
git checkout -b NuevoBranch

-- Ver los branch
git branch

-- Diferencias entre archivos
git diff

-- Vitacora
git log

----------------------------------------------------------------------
--------------------> Usando git remote <-----------------------------
----------------------------------------------------------------------

----------------------------------------------------------------------
-- Configuracion y uso de repositorios remotos
----------------------------------------------------------------------

-- Usando git remoto
-- Ver conexion remota a repositorio
git remote

-- Agregar conexion remota a repositorio
git remote add origin https://serareco@github.com/serareco/tp01.git

-- Borrar conexion remota a repositorio
git remote rm NombreRemote

-- Subir de repositorio local a repositorio remoto
git push origin master

-- Bajar de repositorio remoto a repositorio local
git pull origin master