class Solution{
    int[] lr={-1,0,1,0};
    int[] lc={0,1,0,-1};

    public int minMoves(String[] classroom,int energy){
        int n=classroom.length;
        int m=classroom[0].length();

        char[][] grid=new char[n][m];
        int litter=0;
        int sx=0,sy=0;

        for(int i=0;i<n;i++){
            grid[i]=classroom[i].toCharArray();
            for(int j=0;j<m;j++){
                if(grid[i][j]=='S'){
                    sx=i;
                    sy=j;
                }
                if(grid[i][j]=='L'){
                    litter++;
                }
            }
        }

        if(litter==0)return 0;

        int[][] id=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(id[i],-1);
        }

        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='L'){
                    id[i][j]=cnt++;
                }
            }
        }

        int totalMask=(1<<litter)-1;

        Queue<int[]> q=new LinkedList<>();
        boolean[][][][] vis=new boolean[n][m][energy+1][1<<litter];

        q.offer(new int[]{sx,sy,energy,0,0});
        vis[sx][sy][energy][0]=true;

        while(!q.isEmpty()){
            int[] p=q.poll();

            int x=p[0];
            int y=p[1];
            int ene=p[2];
            int mask=p[3];
            int moves=p[4];

            for(int k=0;k<4;k++){
                int nx=x+lr[k];
                int ny=y+lc[k];

                if(nx<0||nx>=n||ny<0||ny>=m)continue;
                if(grid[nx][ny]=='X')continue;

                int newEnergy=ene-1;

                if(newEnergy<0)continue;

                int newMask=mask;

                if(grid[nx][ny]=='L'){
                    newMask|=(1<<id[nx][ny]);
                }

                if(newMask==totalMask){
                    return moves+1;
                }

                if(grid[nx][ny]=='R'){
                    newEnergy=energy;
                }

                if(!vis[nx][ny][newEnergy][newMask]){
                    vis[nx][ny][newEnergy][newMask]=true;
                    q.offer(new int[]{
                        nx,ny,newEnergy,newMask,moves+1
                    });
                }
            }
        }

        return -1;
    }
}