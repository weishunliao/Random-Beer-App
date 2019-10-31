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
        marginTop: "50px"
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
    name: {
        fontWeight: "bold"
    }
}));

export default function MediaCard(props) {
    const classes = useStyles();
    let data = props.content;
    return (
        <div className={classes.root}>
            <Paper className={classes.paper}>
                <Grid container spacing={2}>
                    <Grid item style={{backgroundColor: "#d5d5d5"}}>
                        <ButtonBase className={classes.image}>
                            <img className={classes.img} alt="complex" src={data.image}/>
                        </ButtonBase>
                    </Grid>
                    <Grid item xs={12} sm container justify={'space-evenly'}>
                        <Grid item xs container direction="column" spacing={2}>
                            <CardContent>
                                <Grid item xs={12}>
                                    <Typography gutterBottom variant="h5" component="h2" className={classes.name}>
                                        {data.name}
                                    </Typography>
                                </Grid>
                                <Grid item xs={12}>
                                    <Typography variant="body2" color="textSecondary" component="p" style={{fontSize:'14pt'}}>
                                        {data.description}
                                    </Typography>
                                </Grid>
                                <Grid item xs={12}>
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
                                </Grid>
                            </CardContent>
                        </Grid>
                    </Grid>
                </Grid>
            </Paper>
        </div>);
}