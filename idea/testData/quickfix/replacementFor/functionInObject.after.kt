// "Replace by 'doIt' call" "true"
// WITH_LIBRARY_AND_RUNTIME: replacementFor/annotation
import new.NewObject
import old.doIt

fun foo() {
    NewObject.doIt("a")
}