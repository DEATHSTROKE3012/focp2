class Stack
{
int e[]=new int[10];
int tos;
void push(int a)
{
if(spaceLeft())
{
tos++;
e[tos]=a;
}
}
void pop()
{
if(!Empty())
{
tos--;
}
}
boolean isEmpty()
{
if(tos==1)
return true;
else
return false;
}
boolean isFull(){
if (tos==9)
return true;
else 
return false;
}
boolean spaceLeft(){
if(tos<9)
return true;
else
return false;
}
}