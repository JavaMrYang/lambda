/*
package com.source;

public abstract class AbsractList<E> extends AbstractCollection<E> implements List<E>{
    protected AbsractList(){

    }

    public boolean add(E e){
        add(size(),e);
        return true;
    }

    abstract public E get(int index);

    public E set(int index,E element){throw new UnsupportedOperationException();}

    public void add(int index, E element) {
        throw new UnsupportedOperationException();
    }

    public E remove(int index) {
        throw new UnsupportedOperationException();
    }

    public int indexOf(Object element){
        ListIterator<E> it=this.listIterator();
        if(element==null){
            while (it.hasNext()){
                if(it.next()==null){
                    return it.previousIndex();
                }
            }
        }else{
            while (it.hasNext()){
                if(element.equals(it.next())){
                    return it.previousIndex();
                }
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        ListIterator<E> it = listIterator(size());
        if (o==null) {
            while (it.hasPrevious())
                if (it.previous()==null)
                    return it.nextIndex();
        } else {
            while (it.hasPrevious())
                if (o.equals(it.previous()))
                    return it.nextIndex();
        }
        return -1;
    }

    public void clear() { removeRange(0, size());}

    protected void removeRange(int fromIndex, int toIndex){
        ListIterator<E> it=this.listIterator(fromIndex);
        for(int i=0,n=toIndex-fromIndex;i<n;i++){
            it.next();
            it.remove();
        }
    }
    private void rangeCheckForAdd(int index) {
        if (index < 0 || index > size())
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }
    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size();
    }
    public boolean addAll(int index, Collection<? extends E> c) {
        rangeCheckForAdd(index);
        boolean modified = false;
        for (E e : c) {
            add(index++, e);
            modified = true;
        }
        return modified;
    }
};
*/
