// import React from 'react';
// import {makeStyles} from '@material-ui/core/styles';
// import Card from '@material-ui/core/Card';
// import CardActionArea from '@material-ui/core/CardActionArea';
// import CardContent from '@material-ui/core/CardContent';
// import CardMedia from '@material-ui/core/CardMedia';
// import Typography from '@material-ui/core/Typography';
// import Grid from "@material-ui/core/Grid";
// import Paper from "@material-ui/core/Paper";
//
//
// const useStyles = makeStyles(theme => ({
//     card: {
//         marginTop: 30
//     },
//     media: {
//         height: 450,
//     },
//     root: {
//         flexGrow: 1,
//     },
//     paper: {
//         padding: theme.spacing(2),
//         textAlign: 'center',
//         fontSize: "11pt"
//     },
//     subtitle :{
//         margin: 0,
//     }
// }));
//
//
// export default function MediaCard(props) {
//     const classes = useStyles();
//     let data = props.content;
//     return (
//         <Card className={classes.card}>
//             <CardActionArea>
//                 <CardMedia
//                     className={classes.media}
//                     image={data.image}
//                     title="Contemplative Reptile"
//                 />
//                 <CardContent>
//                     <Typography gutterBottom variant="h5" component="h2">
//                         {data.name}
//                     </Typography>
//                     <Typography variant="body2" color="textSecondary" component="p">
//                         {data.description}
//                     </Typography>
//                     <div className={classes.root}>
//                         <Grid container spacing={3}>
//                             <Grid item  sm={4}>
//                                 <Paper className={classes.paper}><h4 className={classes.subtitle}>Abv:</h4> {data.abv}%</Paper>
//                             </Grid>
//                             <Grid item  sm={4}>
//                                 <Paper className={classes.paper}><h4 className={classes.subtitle}>Brewery:</h4> {data.breweryName}</Paper>
//                             </Grid>
//                             <Grid item  sm={4}>
//                                 <Paper className={classes.paper}><h4 className={classes.subtitle}>Location:</h4> {data.breweryLocation}</Paper>
//                             </Grid>
//                         </Grid>
//                     </div>
//                 </CardContent>
//             </CardActionArea>
//         </Card>
//     );
// }

import React from 'react';
import {makeStyles} from '@material-ui/core/styles';
import Grid from '@material-ui/core/Grid';
import Paper from '@material-ui/core/Paper';
import Typography from '@material-ui/core/Typography';
import ButtonBase from '@material-ui/core/ButtonBase';
import CardContent from "@material-ui/core/CardContent";

const useStyles = makeStyles(theme => ({
    root: {
        flexGrow: 1,
        marginTop:"50px"
    },
    paper: {
        padding: theme.spacing(2),
        maxWidth: '100%',
        height: '80%'
    },
    image: {
        width: '300px',
        height: '400px'
    },
    img: {
        margin: 'auto',
        display: 'block',
        maxWidth: '100%',
        maxHeight: '100%',
    },
    subtitle: {
        margin: "5px",
    },
    name :{
        fontWeight:"bold"
    }
}));

export default function MediaCard(props) {
    const classes = useStyles();
    let data = props.content;
    return (
        <div className={classes.root}>
            <Paper className={classes.paper}>
                <Grid container spacing={2}>
                    <Grid item >
                        <ButtonBase className={classes.image}>
                            <img className={classes.img} alt="complex" src={data.image}/>
                        </ButtonBase>
                    </Grid>
                    <Grid item xs={12} sm container>
                        <Grid item xs container direction="column" spacing={2}>
                            <Grid item xs>
                                <CardContent>
                                    <Typography gutterBottom variant="h5" component="h2" className={classes.name}>
                                        {data.name}
                                    </Typography>
                                    <Typography variant="body2" color="textSecondary" component="p">
                                        {data.description}
                                    </Typography>
                                    <div className={classes.root}>
                                        <Grid container spacing={3}>
                                            <Grid item sm={4}>
                                                <Paper className={classes.paper}><h4
                                                    className={classes.subtitle}>Abv:</h4> {data.abv}%</Paper>
                                            </Grid>
                                            <Grid item sm={4}>
                                                <Paper className={classes.paper}><h4
                                                    className={classes.subtitle}>Brewery:</h4> {data.breweryName}
                                                </Paper>
                                            </Grid>
                                            <Grid item sm={4}>
                                                <Paper className={classes.paper}><h4
                                                    className={classes.subtitle}>Location:</h4> {data.breweryLocation}
                                                </Paper>
                                            </Grid>
                                        </Grid>
                                    </div>
                                </CardContent>
                            </Grid>
                        </Grid>
                    </Grid>
                </Grid>
            </Paper>
        </div>
    );
}