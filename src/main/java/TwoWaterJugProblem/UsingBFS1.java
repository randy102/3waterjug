package TwoWaterJugProblem;

/*
 *
 */

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.ArrayList;
        
public class UsingBFS1 {
    public static int MAX_JUG1, MAX_JUG2, GOAL;
    
    public static Queue<State> queue = new LinkedList<>();
    
    public static Set<State> visited = new HashSet<State>(){
        public boolean contains(Object obj) {
            State state = (State) obj;
        
            for (State s : this) {
                if (s.equals(state)) {
                    return true;
                }
            }
        
            return false;
        }
    };
    
    public static void main(String[] args) {
        MAX_JUG1 = 3;
        MAX_JUG2 = 4;
        GOAL = 2;

	State initialState = new State(0, 0);
        queue.add(initialState);      
        visited.add(initialState);
        
	while(!queue.isEmpty()){             
            State currentState = queue.poll();                                              
            currentState.addStateToCurrentPath();
            
            if(currentState.getJug1() == GOAL || currentState.getJug2() == GOAL){
		currentState.printPath();                
                continue;
            }            
            
            ArrayList<State> newStates = new ArrayList<>();
            
            newStates.add(currentState.full_jug1(MAX_JUG1));
            newStates.add(currentState.full_jug2(MAX_JUG2));
            newStates.add(currentState.empty_jug1()); 
            newStates.add(currentState.empty_jug2());                        
            newStates.add(currentState.pour_jug1_jug2(MAX_JUG2));
            newStates.add(currentState.pour_jug2_jug1(MAX_JUG1));
            
            for (State newState : newStates){                                                      
                if(!visited.contains(newState)){                                        
                    newState.setPath(currentState.getPath());                                        
                    queue.add(newState);                   
                    visited.add(newState);
                }                                             
            }                       
	}
    }        
}
