## Configuración de Git:

- `git --version`: muestra la versión de Git que tenemos instalada.
- `git config --global user.name [nombre_de_usuario]`: configura el nombre de usuario.
- `git config --global user.email [correo_electronico]`: configura el correo electrónico.
- `git config --global user.editor "code --wait"`: configura el editor de código por defecto a Visual Studio Code.
- `git config --global init.defaultBranch [nombre_de_la_rama]`: configura el nombre de la rama global, se sugiere usar "main".
- `git config --global pull.rebase false`: configura que el pull haga un merge.
- `git config --global alias.tree "log --graph --decorate --all --oneline"`: configuramos un alias para ver el historial.
- `git config --global core.autocrlf input`: en caso de tener Mac o Linux.
- `git config --global core.autocrlf true`: en caso de tener Windows.
- `git config --global -e`: muestra la configuración global.
- `git config -h`: lista todas las configuraciones de Git.

## Comandos básicos:

- `git init`: inicializa un nuevo repositorio en Git.
- `git status`: muestra el estado actual del repositorio.
- `git status -s`: muestra un mejor formato de `git status`.
- `git add [nombre_del_archivo_o_directorio]`: agrega los cambios realizados a una zona de staged.
- `git commit -m [nombre_del_commit]`: guarda los cambios que están en la zona de staged en el historial de Git.
- `git push`: sube los cambios al repositorio remoto.
- `git diff`: muestra los cambios realizados.
- `git diff --staged`: muestra los cambios que se encuentran en la zona de staged.
- `git log`: muestra el historial de los commits.
- `git tree`: muestra un mejor git log.
- `git clone [url_del_repositorio]`: clona el repositorio remoto a local.
- `git reset --hard [hash_del_commit]`: vuelve al commit especificado, deshaciendo todos los cambios realizados en el directorio de trabajo y en la zona de staged.
- `git reflog`: muestra un registro de todas las acciones que has realizado en tu repositorio, incluyendo commits, fusiones, eliminaciones de ramas, etc. 

## Ramas:

- `git branch`: muestra la rama actual.
- `git branch -a`: muestra todas las ramas, tanto locales como remotas.
- `git branch -m [nombre_de_la_rama]`: cambia el nombre de una rama.
- `git branch -d [nombre_de_la_rama]`: elimina la rama especificada.
- `git switch [nombre_de_la_rama]`: cambia de rama.
- `git checkout [nombre_de_la_rama] o [hash_del_commit]`: cambiar entre ramas o para deshacer cambios realizados en el directorio de trabajo.
- `git merge [nombre_de_la_rama]`: trae los cambios de una rama a otra.
- `git stash`: guarda temporalmente los cambios realizados en la rama actual.
- `git stash apply`: aplica los cambios guardados con `git stash`.

## Comandos para trabajar con repositorios remotos

- `git remote -v`: muestra los repositorios remotos vinculados al repositorio local.
- `git fetch`: descarga los cambios realizados en el repositorio remoto, pero no los fusiona con la rama actual.
- `git pull`: descarga los cambios realizados en el repositorio remoto y los fusiona con la rama actual.

## Quitar, mover, eliminar, renombrar archivos:

- `git rm [nombre_del_archivo]`: elimina el archivo y lo agrega a la zona de staged.
- `git restore --cached [nombre_del_archivo]`: quita los archivos de la zona de staged.
- `git restore [nombre_del_archivo]`: descarta los cambios.
- `git mv [nombre_del_archivo] [nuevo_nombre]`: renombra y agrega a la zona de staged.

## Comandos de la terminal:

- `mkdir [nombre_del_directorio]`: crea una carpeta nueva.
- `touch [nombre_del_archivo]`: crea un nuevo archivo.
- `cat [nombre_del_archivo] `: muestra el contenido del archivo.

---

Creado por Arturo Miranda. Enlace a mi perfil de GitHub: [mi perfil](https://github.com/miracodex)
