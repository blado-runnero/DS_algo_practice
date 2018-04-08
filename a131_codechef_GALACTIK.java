import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class a131_codechef_GALACTIK {

	public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().trim().split(" ");
        int n=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);
        int id[]=new int[n+1];
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=1;i<=n;i++)
        {
            map.put(i,new ArrayList<Integer>());
        }
        for(int i=1;i<=m;i++)
        {
            s=br.readLine().trim().split(" ");
            int x=Integer.parseInt(s[0]);
            int y=Integer.parseInt(s[1]);
            map.get(x).add(y);
            map.get(y).add(x);
        }
        
        int cost[]=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            cost[i]=Integer.parseInt(br.readLine().trim());
        }
        boolean vis[]=new boolean[n+1];
        int conn=0,f=0,supmin=Integer.MAX_VALUE;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(!vis[i])
            {
                Stack st=new Stack();
                conn++;
                st.push(i);
                vis[i]=true;
                id[i]=conn;
                int min=1000000000;
                while(!st.empty())
                {
                    int a=(Integer)st.pop();
                    if(cost[a]>=0)
                    {
                        min=(int)Math.min(min,cost[a]);
                    }
                    for(int j:map.get(a))
                    {
                        if(!vis[j])
                      {
                            id[j]=conn;
                            vis[j]=true;
                            st.push(j);
                        }
                    }
                }
                if(min==1000000000)
                {
                    f=1;
                    break;
                }
                list.add(min);
                if(min<supmin)
                supmin=min;
            }
        }
        if(conn==1)
        System.out.println("0");
        else
        {
            if(f==1)
            System.out.println("-1");
            else
            {
                int ans=0;boolean flag=false;
                for(int i:list)
                {
                    if(i!=supmin || flag)
                    {
                        ans+=supmin+i;
                    }
                    else
                    flag=true;
                }
                System.out.println(ans);
            }
        }
    }
}




